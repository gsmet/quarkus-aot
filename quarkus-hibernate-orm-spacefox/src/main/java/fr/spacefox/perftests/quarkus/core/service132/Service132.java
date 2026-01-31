package fr.spacefox.perftests.quarkus.core.service132;

import fr.spacefox.perftests.quarkus.core.port.data.Entity132DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service132.model.Model132;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service132 {

    private final Entity132DatasourcePort datasource;

    public Service132(Entity132DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model132 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
