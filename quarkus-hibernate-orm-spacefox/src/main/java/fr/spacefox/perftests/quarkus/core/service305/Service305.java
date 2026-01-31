package fr.spacefox.perftests.quarkus.core.service305;

import fr.spacefox.perftests.quarkus.core.port.data.Entity305DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service305.model.Model305;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service305 {

    private final Entity305DatasourcePort datasource;

    public Service305(Entity305DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model305 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
