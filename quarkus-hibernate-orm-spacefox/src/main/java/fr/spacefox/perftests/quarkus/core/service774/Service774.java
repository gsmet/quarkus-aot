package fr.spacefox.perftests.quarkus.core.service774;

import fr.spacefox.perftests.quarkus.core.port.data.Entity774DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service774.model.Model774;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service774 {

    private final Entity774DatasourcePort datasource;

    public Service774(Entity774DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model774 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
