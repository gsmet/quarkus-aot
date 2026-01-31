package fr.spacefox.perftests.quarkus.core.service783;

import fr.spacefox.perftests.quarkus.core.port.data.Entity783DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service783.model.Model783;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service783 {

    private final Entity783DatasourcePort datasource;

    public Service783(Entity783DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model783 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
