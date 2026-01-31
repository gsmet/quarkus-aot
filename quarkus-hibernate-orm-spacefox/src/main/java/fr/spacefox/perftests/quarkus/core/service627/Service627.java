package fr.spacefox.perftests.quarkus.core.service627;

import fr.spacefox.perftests.quarkus.core.port.data.Entity627DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service627.model.Model627;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service627 {

    private final Entity627DatasourcePort datasource;

    public Service627(Entity627DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model627 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
