package fr.spacefox.perftests.quarkus.core.service85;

import fr.spacefox.perftests.quarkus.core.port.data.Entity85DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service85.model.Model85;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service85 {

    private final Entity85DatasourcePort datasource;

    public Service85(Entity85DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model85 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
