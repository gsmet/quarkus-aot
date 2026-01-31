package fr.spacefox.perftests.quarkus.core.service640;

import fr.spacefox.perftests.quarkus.core.port.data.Entity640DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service640.model.Model640;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service640 {

    private final Entity640DatasourcePort datasource;

    public Service640(Entity640DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model640 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
