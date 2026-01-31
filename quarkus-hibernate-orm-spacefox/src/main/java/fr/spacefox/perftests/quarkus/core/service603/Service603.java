package fr.spacefox.perftests.quarkus.core.service603;

import fr.spacefox.perftests.quarkus.core.port.data.Entity603DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service603.model.Model603;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service603 {

    private final Entity603DatasourcePort datasource;

    public Service603(Entity603DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model603 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
