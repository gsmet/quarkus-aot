package fr.spacefox.perftests.quarkus.core.service559;

import fr.spacefox.perftests.quarkus.core.port.data.Entity559DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service559.model.Model559;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service559 {

    private final Entity559DatasourcePort datasource;

    public Service559(Entity559DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model559 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
