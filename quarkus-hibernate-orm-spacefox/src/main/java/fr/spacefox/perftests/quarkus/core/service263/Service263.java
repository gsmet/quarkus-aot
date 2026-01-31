package fr.spacefox.perftests.quarkus.core.service263;

import fr.spacefox.perftests.quarkus.core.port.data.Entity263DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service263.model.Model263;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service263 {

    private final Entity263DatasourcePort datasource;

    public Service263(Entity263DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model263 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
