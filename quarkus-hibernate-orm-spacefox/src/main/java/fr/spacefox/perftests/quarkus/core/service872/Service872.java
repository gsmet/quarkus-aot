package fr.spacefox.perftests.quarkus.core.service872;

import fr.spacefox.perftests.quarkus.core.port.data.Entity872DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service872.model.Model872;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service872 {

    private final Entity872DatasourcePort datasource;

    public Service872(Entity872DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model872 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
