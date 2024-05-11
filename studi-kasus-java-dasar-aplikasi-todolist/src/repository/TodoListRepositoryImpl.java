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
    public void remove(Integer number) {

    }
}
