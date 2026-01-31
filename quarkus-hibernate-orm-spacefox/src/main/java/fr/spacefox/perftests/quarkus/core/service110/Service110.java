package fr.spacefox.perftests.quarkus.core.service110;

import fr.spacefox.perftests.quarkus.core.port.data.Entity110DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service110.model.Model110;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service110 {

    private final Entity110DatasourcePort datasource;

    public Service110(Entity110DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model110 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
