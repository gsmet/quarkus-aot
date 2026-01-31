package fr.spacefox.perftests.quarkus.core.service362;

import fr.spacefox.perftests.quarkus.core.port.data.Entity362DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service362.model.Model362;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service362 {

    private final Entity362DatasourcePort datasource;

    public Service362(Entity362DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model362 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
