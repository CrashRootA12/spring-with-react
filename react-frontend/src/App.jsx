import "bootstrap/dist/css/bootstrap.min.css";
import { useEffect, useState } from "react";
function App() {
  const [theList, setTheList] = useState([]);
  useEffect(() => {
    const fetchData = async () =>
      setTheList(
        await (await fetch("/getRequiredDetails")).json()
      );

    fetchData();
  }, []);
  return (
    <>
      <table className="table">
        <thead>
          <th scope="col">empno</th>
          <th scope="col">name</th>
          <th scope="col">job</th>
          <th scope="col">dept</th>
        </thead>
        <tbody>
          {theList.map(({ empno, name, job, dept }) => (
            <tr>
              <th scope="row">{empno}</th>
              <td>{name}</td>
              <td>{job}</td>
              <td>{dept}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}

export default App;
