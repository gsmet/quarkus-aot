package fr.spacefox.perftests.quarkus.core.service628;

import fr.spacefox.perftests.quarkus.core.port.data.Entity628DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service628.model.Model628;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service628 {

    private final Entity628DatasourcePort datasource;

    public Service628(Entity628DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model628 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
