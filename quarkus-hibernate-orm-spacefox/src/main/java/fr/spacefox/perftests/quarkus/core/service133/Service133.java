package fr.spacefox.perftests.quarkus.core.service133;

import fr.spacefox.perftests.quarkus.core.port.data.Entity133DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service133.model.Model133;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service133 {

    private final Entity133DatasourcePort datasource;

    public Service133(Entity133DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model133 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
