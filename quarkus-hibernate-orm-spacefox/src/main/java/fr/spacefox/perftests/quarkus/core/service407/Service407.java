package fr.spacefox.perftests.quarkus.core.service407;

import fr.spacefox.perftests.quarkus.core.port.data.Entity407DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service407.model.Model407;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service407 {

    private final Entity407DatasourcePort datasource;

    public Service407(Entity407DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model407 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
