package fr.spacefox.perftests.quarkus.core.service243;

import fr.spacefox.perftests.quarkus.core.port.data.Entity243DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service243.model.Model243;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service243 {

    private final Entity243DatasourcePort datasource;

    public Service243(Entity243DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model243 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
