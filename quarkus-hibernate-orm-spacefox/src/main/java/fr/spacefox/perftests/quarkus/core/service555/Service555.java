package fr.spacefox.perftests.quarkus.core.service555;

import fr.spacefox.perftests.quarkus.core.port.data.Entity555DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service555.model.Model555;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service555 {

    private final Entity555DatasourcePort datasource;

    public Service555(Entity555DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model555 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
