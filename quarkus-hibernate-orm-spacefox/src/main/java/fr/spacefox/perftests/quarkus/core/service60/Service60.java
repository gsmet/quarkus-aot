package fr.spacefox.perftests.quarkus.core.service60;

import fr.spacefox.perftests.quarkus.core.port.data.Entity60DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service60.model.Model60;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service60 {

    private final Entity60DatasourcePort datasource;

    public Service60(Entity60DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model60 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
