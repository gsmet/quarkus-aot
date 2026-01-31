package fr.spacefox.perftests.quarkus.core.service200;

import fr.spacefox.perftests.quarkus.core.port.data.Entity200DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service200.model.Model200;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service200 {

    private final Entity200DatasourcePort datasource;

    public Service200(Entity200DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model200 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
