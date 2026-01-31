package fr.spacefox.perftests.quarkus.core.service882;

import fr.spacefox.perftests.quarkus.core.port.data.Entity882DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service882.model.Model882;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service882 {

    private final Entity882DatasourcePort datasource;

    public Service882(Entity882DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model882 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
