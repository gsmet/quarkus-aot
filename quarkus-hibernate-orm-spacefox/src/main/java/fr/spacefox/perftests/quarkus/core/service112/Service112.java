package fr.spacefox.perftests.quarkus.core.service112;

import fr.spacefox.perftests.quarkus.core.port.data.Entity112DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service112.model.Model112;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service112 {

    private final Entity112DatasourcePort datasource;

    public Service112(Entity112DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model112 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
