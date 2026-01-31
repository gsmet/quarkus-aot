package fr.spacefox.perftests.quarkus.core.service424;

import fr.spacefox.perftests.quarkus.core.port.data.Entity424DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service424.model.Model424;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service424 {

    private final Entity424DatasourcePort datasource;

    public Service424(Entity424DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model424 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
