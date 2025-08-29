package model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComputerSale {

    //relations
    private List<Computer> comps = new ArrayList<>();

    public List<Computer> getComputers() {
        return comps;
    }

    public void sortByProcessing(List<Computer> comps) {
        int n = comps.size();
        boolean cambio;

        for (int i = 0; i < n - 1; i++) {
            cambio = false;
            for (int j = 0; j < n - i -1; j++) {
                if (comps.get(j).compareTo(comps.get(j+1)) > 0) {
                    Computer temp = comps.get(j);
                    comps.set(j, comps.get(j+1));
                    comps.set(j+1, temp);
                }
            }
            if (!cambio) break;
        }
    }

    public void sortByProcessing1(List<Computer> comps) {
        int n = comps.size();
        boolean cambio;

        for (int i = 0; i < n - 1; i++) {
            cambio = false;
            for (int j = 0; j < n - i -1; j++) {
                double procesingA = comps.get(j).getProcessor() * comps.get(j).getProcessingSpeed();
                double procesingB = comps.get(j+1).getProcessor() * comps.get(j+1).getProcessingSpeed();
                if (comps.get(j).compareTo(comps.get(j+1)) > 0) {
                    Computer temp = comps.get(j);
                    comps.set(j, comps.get(j+1));
                    comps.set(j+1, temp);
                }
            }
            if (!cambio) break;
        }
    }

    public void sortByBrand(List<Computer> comps) {
        throw new NotImplementedException();
    }
}