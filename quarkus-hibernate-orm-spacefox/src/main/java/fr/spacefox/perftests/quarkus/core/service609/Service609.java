package fr.spacefox.perftests.quarkus.core.service609;

import fr.spacefox.perftests.quarkus.core.port.data.Entity609DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service609.model.Model609;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service609 {

    private final Entity609DatasourcePort datasource;

    public Service609(Entity609DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model609 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
