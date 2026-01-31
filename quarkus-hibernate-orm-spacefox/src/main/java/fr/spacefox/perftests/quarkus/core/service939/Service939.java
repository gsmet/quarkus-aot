package fr.spacefox.perftests.quarkus.core.service939;

import fr.spacefox.perftests.quarkus.core.port.data.Entity939DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service939.model.Model939;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service939 {

    private final Entity939DatasourcePort datasource;

    public Service939(Entity939DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model939 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
