package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;

import studio.programkode.jatf.java25.BaseAssignment;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static studio.programkode.jatf.java25.Framework.*;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{

        static private final String BallFQCN = "assignment.Ball";
        static private final String TTRFQCN = "assignment.TableTennisRacket";
        static private final String VBFQCN = "assignment.Volleyball";
        static private final String FBFQCN = "assignment.Fotball";
        static private final String HBFQCN = "assignment.Handball";
        static private final String BBFQCN = "assignment.Basketball";
        static private final String EquFQCN = "assignment.Equipment";
        static private final String InvFQCN = "assignment.Inventory";
        static private final String MainFQCN = "assignment.Maintenance";

        //private final PrintStream originalOut = System.out;


        @DisplayName("Oppgave #1.1 - test av oppretting av klasser og bruk av arv")
        @Order(1)
        @Test()
        public void oppgave11() {
            // Code that tests assignment goes here
            testClass(InvFQCN, () -> {
                provideHintIfAssertionFails(
                        "Har du husket å bruke arv?"
                        ,
                        () -> {

                            assertTrue(methodExists("returnAllEquipments"));

                        }
                );


            });

            testClass(BBFQCN, () -> {
                provideHintIfAssertionFails(
                        "Har du husket å bruke arv?"
                        ,
                        () -> {

                            assertTrue(classInheritsFrom(Ball.class));

                        }
                );


            });

            testClass(FBFQCN, () -> {
                provideHintIfAssertionFails(
                        "Har du husket å bruke arv?"
                        ,
                        () -> {

                            assertTrue(classInheritsFrom(Ball.class));

                        }
                );


            });

            testClass(VBFQCN, () -> {
                provideHintIfAssertionFails(
                        "Har du husket å bruke arv?"
                        ,
                        () -> {

                            assertTrue(classInheritsFrom(Ball.class));

                        }
                );


            });

            testClass(HBFQCN, () -> {
                provideHintIfAssertionFails(
                        "Har du husket å bruke arv?"
                        ,
                        () -> {

                            assertTrue(classInheritsFrom(Ball.class));

                        }
                );


            });

            testClass(BallFQCN, () -> {
                provideHintIfAssertionFails(
                        "Har du husket å bruke arv?"
                        ,
                        () -> {

                            assertTrue(classInheritsFrom(Equipment.class));

                        }
                );


            });

            testClass(TTRFQCN, () -> {
                provideHintIfAssertionFails(
                        "Har du husket å bruke arv?"
                        ,
                        () -> {

                            assertTrue(classInheritsFrom(Equipment.class));

                        }
                );


            });


        }


        @DisplayName("Oppgave #1.2 - ekstra test for arv")
        @Order(2)
        @Test()
        public void oppgave12() {
            // Code that tests assignment goes here
            testClass(BallFQCN, () -> {
                provideHintIfAssertionFails(
                        "Objekter av type Ball kan opprettes. Hvilket nøkkelord fra forelesning 8 har du kanskje glemt?"
                        ,
                        () -> {

                            try {
                                var shape = classCreateInstance();
                                fail();
                            }
                            catch (Exception e){
                                assertTrue(true);
                            }

                        }
                );


            });




            // Code that tests assignment goes here
            testClass(EquFQCN, () -> {
                provideHintIfAssertionFails(
                        "Objekter av type Equipment kan opprettes. Hvilket nøkkelord fra forelesning 8 har du kanskje glemt?"
                        ,
                        () -> {

                            try {
                                var shape = classCreateInstance();
                                fail();
                            }
                            catch (Exception e){
                                assertTrue(true);
                            }

                        }
                );


            });

        }

        @DisplayName("Oppgave #2 - test av oppretting av maintenance klasse og bruk av aggregering")
        @Order(3)
        @Test()
        public void oppgave21() {
            // Code that tests assignment goes here

            testClass(MainFQCN, () -> {

                provideHintIfAssertionFails(
                        "Har du husket å bruke aggregering og deklarere methodene riktig og uten parameter?"
                        ,
                        () -> {

                            assertTrue(methodExists("printBallsNeedingMoreAir"));
                            assertTrue(methodExists("printEquipmentNeedingToBeReplaced"));
                            assertTrue(methodExists("printTableTennisRacketsNeedingNewPad"));


                        }
                );


            });
        }







}
