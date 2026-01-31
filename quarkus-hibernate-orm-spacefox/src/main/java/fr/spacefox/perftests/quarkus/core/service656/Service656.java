package fr.spacefox.perftests.quarkus.core.service656;

import fr.spacefox.perftests.quarkus.core.port.data.Entity656DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service656.model.Model656;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service656 {

    private final Entity656DatasourcePort datasource;

    public Service656(Entity656DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model656 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
