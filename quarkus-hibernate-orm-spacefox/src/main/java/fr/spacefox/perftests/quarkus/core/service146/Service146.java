package fr.spacefox.perftests.quarkus.core.service146;

import fr.spacefox.perftests.quarkus.core.port.data.Entity146DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service146.model.Model146;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service146 {

    private final Entity146DatasourcePort datasource;

    public Service146(Entity146DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model146 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
