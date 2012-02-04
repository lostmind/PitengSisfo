/** 
 * Autogenerated by Recite18th at Sat Jul 09 13:10:48 WIT 2011
 * 
 */
package application.models;

import recite18th.model.Model;
import application.models._PrajabatanModel;
import recite18th.library.Db;

public class PrajabatanModel extends _PrajabatanModel {

    public PrajabatanModel() {
        super();
    }
    public String nama_pegawai;

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getNama_pegawai() {
        return Db.findValue("pegawai", "nama_pegawai", "nip='" + nip + "'");
    }

    @Override
    public void overrideDefaultValue(Model model) {
        PegawaiModel pegawaiTerpilih = (PegawaiModel) session.getAttribute("pegawai_terpilih");
        PrajabatanModel prajabatanModel = (PrajabatanModel) model;
        prajabatanModel.setNip(pegawaiTerpilih.getNip());
    }
}
