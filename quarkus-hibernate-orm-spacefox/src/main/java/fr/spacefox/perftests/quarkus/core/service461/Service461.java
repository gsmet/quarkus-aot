package fr.spacefox.perftests.quarkus.core.service461;

import fr.spacefox.perftests.quarkus.core.port.data.Entity461DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service461.model.Model461;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service461 {

    private final Entity461DatasourcePort datasource;

    public Service461(Entity461DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model461 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
