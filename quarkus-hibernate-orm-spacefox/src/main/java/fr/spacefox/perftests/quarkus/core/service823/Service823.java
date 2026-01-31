package fr.spacefox.perftests.quarkus.core.service823;

import fr.spacefox.perftests.quarkus.core.port.data.Entity823DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service823.model.Model823;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service823 {

    private final Entity823DatasourcePort datasource;

    public Service823(Entity823DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model823 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
