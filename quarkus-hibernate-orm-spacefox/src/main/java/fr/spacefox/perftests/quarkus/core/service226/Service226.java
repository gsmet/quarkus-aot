package fr.spacefox.perftests.quarkus.core.service226;

import fr.spacefox.perftests.quarkus.core.port.data.Entity226DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service226.model.Model226;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service226 {

    private final Entity226DatasourcePort datasource;

    public Service226(Entity226DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model226 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
