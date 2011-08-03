<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*,recite18th.library.Db,application.config.Config,recite18th.library.Pagination" %><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<% int pagenum = 0; %>
<a href="<%=Config.base_url%>index/Mutasi/input/-1">Tambah Data</a>
<table width="100%" id="rounded-corner">
<thead>
  <tr>
  <th scope="col" class="rounded-company">No.</th>
  <th scope="col" class="rounded-q1">Nip</th>
  <th scope="col" class="rounded-q1">No Sk Mutasi</th>
  <th scope="col" class="rounded-q1">Tmt Mutasi</th>
  <th scope="col" class="rounded-q1">Tujuan Mutasi</th>
  <th scope="col" class="rounded-q1">Jenis Mutasi</th>
  <th scope="col" class="rounded-q1">Pejabat Berwenang</th>
  <th scope="col" class="rounded-q1">Tempat Mutasi</th>
  <th scope="col" class="rounded-q1">Tgl Mutasi</th>
  <th scope="col" class="rounded-q4">Aksi</th>
  </tr>
</thead>
<tfoot>
  <tr>
    <td colspan="10" class="rounded-foot-left"><%=Pagination.createLinks(pagenum)%></td>
    <td class="rounded-foot-right">&nbsp;</td>
  </tr>
</tfoot>
<tbody>
  <c:forEach items="${row}" var="item" varStatus="status" >
    <tr>
      <td>${status.count}</td>
      <td>${item.nip}</td>
      <td>${item.no_sk_mutasi}</td>
      <td>${item.tmt_mutasi}</td>
      <td>${item.tujuan_mutasi}</td>
      <td>${item.jenis_mutasi}</td>
      <td>${item.pejabat_berwenang}</td>
      <td>${item.tempat_mutasi}</td>
      <td>${item.tgl_mutasi}</td>
      <td>
         <a href="<%=Config.base_url%>index/Mutasi/input/${item.idmutasi}">Ubah</a>
         <a href="<%=Config.base_url%>index/Mutasi/delete/${item.idmutasi}" onClick="return confirm('Apakah Anda yakin?');">Hapus</a>
      </td>
    </tr>
  </c:forEach>
</tbody>
</table>
