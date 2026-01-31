package fr.spacefox.perftests.quarkus.core.service47;

import fr.spacefox.perftests.quarkus.core.port.data.Entity47DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service47.model.Model47;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service47 {

    private final Entity47DatasourcePort datasource;

    public Service47(Entity47DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model47 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
