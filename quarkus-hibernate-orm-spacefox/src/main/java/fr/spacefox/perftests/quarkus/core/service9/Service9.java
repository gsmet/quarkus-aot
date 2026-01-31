package fr.spacefox.perftests.quarkus.core.service9;

import fr.spacefox.perftests.quarkus.core.port.data.Entity9DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service9.model.Model9;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service9 {

    private final Entity9DatasourcePort datasource;

    public Service9(Entity9DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model9 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
