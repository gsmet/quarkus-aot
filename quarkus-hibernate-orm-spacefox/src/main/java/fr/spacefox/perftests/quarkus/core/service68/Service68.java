package fr.spacefox.perftests.quarkus.core.service68;

import fr.spacefox.perftests.quarkus.core.port.data.Entity68DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service68.model.Model68;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service68 {

    private final Entity68DatasourcePort datasource;

    public Service68(Entity68DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model68 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
