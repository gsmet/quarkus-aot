package fr.spacefox.perftests.quarkus.core.service981;

import fr.spacefox.perftests.quarkus.core.port.data.Entity981DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service981.model.Model981;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service981 {

    private final Entity981DatasourcePort datasource;

    public Service981(Entity981DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model981 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
