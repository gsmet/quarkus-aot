package fr.spacefox.perftests.quarkus.core.service350;

import fr.spacefox.perftests.quarkus.core.port.data.Entity350DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service350.model.Model350;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service350 {

    private final Entity350DatasourcePort datasource;

    public Service350(Entity350DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model350 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
