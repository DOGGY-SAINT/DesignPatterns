package tj.sse;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import java.util.Scanner;
import java.util.Set;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;

/**
 * @author DOGGY_LEE
 * @date 2021/10/19 19:24
 * @description 全部测试
 */

public class AppTest {
    public static boolean input=false;
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner=new Scanner(System.in);
        LauncherDiscoveryRequestBuilder requestBuilder = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectPackage(AppTest.class.getPackageName()))
                .filters(includeClassNamePatterns(".*Test"));
        LauncherDiscoveryRequest allTestRequest = requestBuilder.build();
        Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(allTestRequest);
        Set<TestIdentifier> testIdentifierSet = testPlan.getChildren("[engine:junit-jupiter]");
        TestIdentifier[] testIdentifierArray = testIdentifierSet.toArray(TestIdentifier[]::new);
        for (int i = 0; i < testIdentifierArray.length; ++i) {
            System.out.printf("%2d: %s\n", i, testIdentifierArray[i].getDisplayName());
        }
        while (true) {
            System.out.print("Current mode:");
            if(input)
                System.out.println("Not auto");
            else
                System.out.println("Auto");
            System.out.println("==========Menu==========\n"
                    +"0-"+(testIdentifierArray.length-1)+" test\n"
                    +testIdentifierArray.length+" automatically test all\n"
                    +"-1 change mode\n"
                    +"-2 test list\n"
                    +"-3 exit\n"
                    +"==========End==========");
            int choice = scanner.nextInt();
            if (choice == -3) {
                break;
            }
            else if (choice == -2) {
                for (int i = 0; i < testIdentifierArray.length; ++i) {
                    System.out.printf("%2d: %s\n", i, testIdentifierArray[i].getDisplayName());
                }
            }
            else if (choice == -1) {
                input=!input;
            }
            else if(0<=choice&&choice<testIdentifierArray.length){
                TestIdentifier chosenTestIdentifier = testIdentifierArray[choice];
                System.out.printf("Testing %2d: %s\n", choice, chosenTestIdentifier.getDisplayName());
                LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                        .selectors(selectPackage(AppTest.class.getPackageName()))
                        .filters(includeClassNamePatterns(chosenTestIdentifier.getLegacyReportingName()))
                        .build();
                launcher.execute(request);
            }
            else if(choice==testIdentifierArray.length){
                boolean before=input;
                input=false;
                choice=0;
                for(TestIdentifier chosenTestIdentifier:testIdentifierArray){
                    System.out.printf("Testing %2d: %s\n", choice++, chosenTestIdentifier.getDisplayName());
                    LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                            .selectors(selectPackage(AppTest.class.getPackageName()))
                            .filters(includeClassNamePatterns(chosenTestIdentifier.getLegacyReportingName()))
                            .build();
                    launcher.execute(request);
                }
                input=before;
            }
            else
                System.out.println("Overflow！");
        }
        scanner.close();
        scanner=null;
    }
}
