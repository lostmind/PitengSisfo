/** 
 * Autogenerated by Recite18th at Sat Jul 09 13:10:48 WIT 2011
 * 
 */

package application.models;
import recite18th.model.Model;
import application.models._PendidikanModel;
import recite18th.library.Db;
public class PendidikanModel extends _PendidikanModel
{
    public PendidikanModel()
    {
        super();
    }
    public String nama_pegawai;
    public void setNama_pegawai(String nama_pegawai)
    {
        this.nama_pegawai = nama_pegawai;
    }
    
    public String getNama_pegawai()
    {
        return Db.findValue("pegawai","nama_pegawai", "nip='" + nip + "'");
    }
}
