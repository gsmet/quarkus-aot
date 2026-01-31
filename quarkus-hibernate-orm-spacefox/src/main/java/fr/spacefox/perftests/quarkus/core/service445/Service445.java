package fr.spacefox.perftests.quarkus.core.service445;

import fr.spacefox.perftests.quarkus.core.port.data.Entity445DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service445.model.Model445;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service445 {

    private final Entity445DatasourcePort datasource;

    public Service445(Entity445DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model445 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
