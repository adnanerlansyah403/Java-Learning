package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodolistRepository {

    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    public boolean isFull() {
        // Cek apakah model / datanya sudah penuh atau belum
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull() {
        // Jika penuh, model nya akan di resize dengan ukuran array 2x lipat
        if(isFull()) {
            var temp = data;
            data = new Todolist[data.length * 2]; // Jika seperti ini akan mereplace data yg sebelumnya

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(Todolist todolist) {
        resizeIfFull();

        // Tambahkan ke posisi yang data array nya null
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if((number - 1) >= data.length) { // Jika number nya lebih besar dr jumlah data model
            return false;
        } else if(data[number - 1] == null) { // Apakah data di index tersebut telah null atau tidak
            return false;
        } else {
            data[number - 1] = null;
            // satu
            // tiga
            // null

            for (int i = number - 1; i < data.length; i++) {
                if(i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
