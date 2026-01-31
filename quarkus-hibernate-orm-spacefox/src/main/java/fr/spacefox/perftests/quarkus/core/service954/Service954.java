package fr.spacefox.perftests.quarkus.core.service954;

import fr.spacefox.perftests.quarkus.core.port.data.Entity954DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service954.model.Model954;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service954 {

    private final Entity954DatasourcePort datasource;

    public Service954(Entity954DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model954 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
