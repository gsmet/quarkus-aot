package fr.spacefox.perftests.quarkus.core.service155;

import fr.spacefox.perftests.quarkus.core.port.data.Entity155DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service155.model.Model155;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service155 {

    private final Entity155DatasourcePort datasource;

    public Service155(Entity155DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model155 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
