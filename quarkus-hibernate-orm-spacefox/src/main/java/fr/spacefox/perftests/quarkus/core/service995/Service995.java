package fr.spacefox.perftests.quarkus.core.service995;

import fr.spacefox.perftests.quarkus.core.port.data.Entity995DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service995.model.Model995;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service995 {

    private final Entity995DatasourcePort datasource;

    public Service995(Entity995DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model995 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
