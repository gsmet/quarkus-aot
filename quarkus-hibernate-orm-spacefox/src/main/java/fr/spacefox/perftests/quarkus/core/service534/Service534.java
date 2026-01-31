package fr.spacefox.perftests.quarkus.core.service534;

import fr.spacefox.perftests.quarkus.core.port.data.Entity534DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service534.model.Model534;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service534 {

    private final Entity534DatasourcePort datasource;

    public Service534(Entity534DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model534 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
