package fr.spacefox.perftests.quarkus.core.service194;

import fr.spacefox.perftests.quarkus.core.port.data.Entity194DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service194.model.Model194;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service194 {

    private final Entity194DatasourcePort datasource;

    public Service194(Entity194DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model194 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
