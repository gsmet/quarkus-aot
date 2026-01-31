package fr.spacefox.perftests.quarkus.core.service836;

import fr.spacefox.perftests.quarkus.core.port.data.Entity836DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service836.model.Model836;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service836 {

    private final Entity836DatasourcePort datasource;

    public Service836(Entity836DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model836 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
