package fr.spacefox.perftests.quarkus.core.service588;

import fr.spacefox.perftests.quarkus.core.port.data.Entity588DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service588.model.Model588;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service588 {

    private final Entity588DatasourcePort datasource;

    public Service588(Entity588DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model588 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
