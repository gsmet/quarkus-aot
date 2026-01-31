package fr.spacefox.perftests.quarkus.core.service898;

import fr.spacefox.perftests.quarkus.core.port.data.Entity898DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service898.model.Model898;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service898 {

    private final Entity898DatasourcePort datasource;

    public Service898(Entity898DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model898 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
