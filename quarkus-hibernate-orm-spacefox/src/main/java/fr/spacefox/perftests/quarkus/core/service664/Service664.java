package fr.spacefox.perftests.quarkus.core.service664;

import fr.spacefox.perftests.quarkus.core.port.data.Entity664DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service664.model.Model664;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service664 {

    private final Entity664DatasourcePort datasource;

    public Service664(Entity664DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model664 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
