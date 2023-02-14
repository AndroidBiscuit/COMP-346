
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.PrimitiveIterator;

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/

        // Code for the output test txt file
        try {
            PrintStream output = new PrintStream("testOutput3.txt");
            System.setOut((output));
        }
        catch (FileNotFoundException e){
            System.out.println("ERROR - File not found!!!");
            System.exit(0);
        }

        // Initialize and start network
    	Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();

        // Initialize and start server
        Server objServer = new Server();
        objServer.start();

        // Initialize and start sending client
        Client objClient1 = new Client("sending");
        objClient1.start();

        // Initialize and start receiving client
        Client objClient2 = new Client("receiving");
        objClient2.start();
    }
}
